import React from "react";

const SearchBar = ({ searchTerm, onSearchChange }) => {
  return (
    <input
      type="text"
      placeholder="Search products..."
      value={searchTerm}
      onChange={(e) => onSearchChange(e.target.value)}
      style={{
        width: "300px",
        padding: "8px",
        margin: "20px 0",
        borderRadius: "4px",
        border: "1px solid #ccc"
      }}
    />
  );
};

export default SearchBar;
