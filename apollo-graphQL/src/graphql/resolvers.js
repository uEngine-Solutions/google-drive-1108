const resolvers = {
    File: {
        video: async (root, {fileId}, {dataSources}) => {
            var parseLink = root._links.self.href.split('/')
            fileId = parseLink[parseLink.length - 1]

            if (productId) {
                return await dataSources.videoProcessingRestApi.findByFileId(fileId);
            }
            return null;
        }
    },
    Index: {
        // set Query
    },
    Video: {
        // set Query
    },
    NotificationHistory: {
        // set Query
    },

    Query: {
        file : async (_, { id }, { dataSources }) => {
            return dataSources.driveRestApi.getFile(id);
        },
        files : async (_, __, { dataSources }) => {
            return dataSources.driveRestApi.getFiles();
        },
        index : async (_, { id }, { dataSources }) => {
            return dataSources.indexerRestApi.getIndex(id);
        },
        indices : async (_, __, { dataSources }) => {
            return dataSources.indexerRestApi.getIndices();
        },
        video : async (_, { id }, { dataSources }) => {
            return dataSources.videoProcessingRestApi.getVideo(id);
        },
        videos : async (_, __, { dataSources }) => {
            return dataSources.videoProcessingRestApi.getVideos();
        },
        notificationHistory : async (_, { id }, { dataSources }) => {
            return dataSources.notificationRestApi.getNotificationHistory(id);
        },
        notificationHistories : async (_, __, { dataSources }) => {
            return dataSources.notificationRestApi.getNotificationHistories();
        },
    }
};

export default resolvers;
