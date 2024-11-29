// SkeletonCard.tsx
import React from "react";

const SkeletonCard: React.FC = () => {
    return (
        <div className="border border-gray-300 rounded-lg shadow-md p-4 text-center bg-purple-300 animate-pulse">
            <div className="w-24 h-24 mx-auto bg-gray-300 rounded-full"></div>
            <div className="mt-2 h-4 w-1/2 mx-auto bg-gray-300 rounded"></div>
            <div className="mt-2 h-3 w-1/3 mx-auto bg-gray-300 rounded"></div>
        </div>
    );
};

export default SkeletonCard;
