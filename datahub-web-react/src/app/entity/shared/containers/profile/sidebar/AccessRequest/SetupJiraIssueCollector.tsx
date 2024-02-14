declare global {
    interface Window {
        ATL_JQ_PAGE_PROPS: any;
        ADDITIONAL_CUSTOM_CONTEXT?: any;
    }
}

export const setupJiraIssueCollector = (customButtonId: string, entityUrn: string, entityData?: any) => {
    const getEntityUrn = () => entityUrn;

    const formatOwnersInfo = (owners: any[]) => {
            if (owners.length === 0) {
                        return "No Owners";
            }
            return owners.map(owner => {
                const ownershipTypeName = owner.ownershipType?.info?.name || 'Unknown Ownership Type';
                const username = owner.owner?.username || 'Unknown User';
                return `${ownershipTypeName}: ${username}`;
            }).join('\n');
     };

    if (!window.ATL_JQ_PAGE_PROPS) {
        window.ATL_JQ_PAGE_PROPS = {
            triggerFunction(showCollectorDialog: () => void) {
                const button = document.getElementById(customButtonId);
                button?.addEventListener('click', (e) => {
                    e.preventDefault();
                    showCollectorDialog();
                });
            },
            environment() {
                const envInfo = {};

                if (window.ADDITIONAL_CUSTOM_CONTEXT) {
                    envInfo['Additional Context Information'] = window.ADDITIONAL_CUSTOM_CONTEXT;
                }

                return envInfo;
            },
            fieldValues() {
                const values: { summary?: string; description?: string; fullname?: string; email?: string  } = {};
                const owners = entityData?.ownership?.owners || [];

                const urn = getEntityUrn();
                values.summary = `Access Request for ${urn}`;
                const encodedUrn = urn.replace(/\(/g, '%28').replace(/\)/g, '%29');
                values.description = `https://datahub-frontend.sharp.com/${urn.split(':')[2]}/${encodedUrn}`;
                const ownersInfoString = formatOwnersInfo(owners);
                values.description += `\n\nOwners:\n${ownersInfoString}`;
                values.fullname = 'Enter Sharp Username';
                values.email = 'email@sharp.com';

                return values;
            },
        };
    } else {
        window.ATL_JQ_PAGE_PROPS.fieldValues = function () {
            const values: { summary?: string; description?: string; fullname?: string; email?: string } = {};
            const owners = entityData?.ownership?.owners || [];

            const urn = getEntityUrn();
            values.summary = `Access Request for ${urn}`;
            const encodedUrn = urn.replace(/\(/g, '%28').replace(/\)/g, '%29');
            values.description = `https://datahub-frontend.sharp.com/${urn.split(':')[2]}/${encodedUrn}`;
            const ownersInfoString = formatOwnersInfo(owners);
            values.description += `\n\nOwners:\n${ownersInfoString}`;
            values.fullname = 'Enter Sharp Username';
            values.email = 'email@sharp.com';

            return values;
        };
    }
};
