import React, { useState, useEffect } from "react";
import PokemonCard from "./PokemonCard";
import SkeletonCard from "./SkeletonCard"; // Asegúrate de importar el SkeletonCard

interface PaginationProps {
    totalPages: number;
}

const Pagination: React.FC<PaginationProps> = ({ totalPages }) => {
    const [currentPage, setCurrentPage] = useState(1);
    const [loading, setLoading] = useState(false);

    const handlePageChange = (page: number) => {
        if (page >= 1 && page <= totalPages) {
            setCurrentPage(page);
        }
    };

    const handlePrevPage = () => {
        if (currentPage > 1) {
            setCurrentPage(currentPage - 1);
        }
    };

    const handleNextPage = () => {
        if (currentPage < totalPages) {
            setCurrentPage(currentPage + 1);
        }
    };

    const renderPageNumbers = () => {
        const pageNumbers = [];
        for (let i = 1; i <= totalPages; i++) {
            pageNumbers.push(
                <li key={i}>
                    <button
                        onClick={() => handlePageChange(i)}
                        className={`block size-8 rounded border ${i === currentPage
                                ? "border-blue-600 bg-blue-600 text-white"
                                : "border-gray-100 bg-white text-center leading-8 text-gray-900"
                            }`}
                    >
                        {i}
                    </button>
                </li>
            );
        }
        return pageNumbers;
    };

    // Generar los Pokémon que corresponden a la página actual
    const getPokemonRange = (page: number) => {
        const start = (page - 1) * 20 + 1; // El primer Pokémon de la página
        const end = Math.min(start + 19, 151); // El último Pokémon de la página, no debe superar 151
        return { start, end };
    };

    const { start, end } = getPokemonRange(currentPage);

    // Simulación de carga (esto puede ser reemplazado por un estado de carga real)
    useEffect(() => {
        setLoading(true);
        setTimeout(() => {
            setLoading(false); // Simula la finalización de la carga
        }, 1000); // 1 segundo de espera simulada
    }, [currentPage]);

    return (
        <div>
            {/* Mostrar los Pokémon de la página actual */}
            <div className="grid grid-cols-2 sm:grid-cols-3 md:grid-cols-4 lg:grid-cols-5 gap-4">
                {loading
                    ? Array.from({ length: 20 }).map((_, index) => (
                        <SkeletonCard key={index} />
                    )) // Muestra SkeletonCard mientras carga
                    : Array.from(
                        { length: end - start + 1 },
                        (_, index) => start + index
                    ).map((pokemonId) => (
                        <PokemonCard key={pokemonId} pokemonId={pokemonId} />
                    ))}
            </div>

            <ol className="flex justify-center gap-1 text-xs font-medium">
                <li>
                    <button
                        onClick={handlePrevPage}
                        className="inline-flex size-8 items-center justify-center rounded border border-gray-100 bg-white text-gray-900 rtl:rotate-180"
                        disabled={currentPage === 1}
                    >
                        <span className="sr-only">Prev Page</span>
                        <svg
                            xmlns="http://www.w3.org/2000/svg"
                            className="size-3"
                            viewBox="0 0 20 20"
                            fill="currentColor"
                        >
                            <path
                                fillRule="evenodd"
                                d="M12.707 5.293a1 1 0 010 1.414L9.414 10l3.293 3.293a1 1 0 01-1.414 1.414l-4-4a1 1 0 010-1.414l4-4a1 1 0 011.414 0z"
                                clipRule="evenodd"
                            />
                        </svg>
                    </button>
                </li>

                {renderPageNumbers()}

                <li>
                    <button
                        onClick={handleNextPage}
                        className="inline-flex size-8 items-center justify-center rounded border border-gray-100 bg-white text-gray-900 rtl:rotate-180"
                        disabled={currentPage === totalPages}
                    >
                        <span className="sr-only">Next Page</span>
                        <svg
                            xmlns="http://www.w3.org/2000/svg"
                            className="size-3"
                            viewBox="0 0 20 20"
                            fill="currentColor"
                        >
                            <path
                                fillRule="evenodd"
                                d="M7.293 14.707a1 1 0 010-1.414L10.586 10 7.293 6.707a1 1 0 011.414-1.414l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414 0z"
                                clipRule="evenodd"
                            />
                        </svg>
                    </button>
                </li>
            </ol>
        </div>
    );
};

export default Pagination;
