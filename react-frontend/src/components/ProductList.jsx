import React, { useEffect, useState } from "react";
import SearchBar from "./SearchBar";

const ProductList = () => {
  const [products, setProducts] = useState([]);
  const [searchTerm, setSearchTerm] = useState("");

  useEffect(() => {
    fetch("http://localhost:8080/api/products")
      .then((res) => res.json())
      .then((data) => setProducts(data))
      .catch(console.error);
  }, []);

  const filteredProducts = products.filter(product =>
    product.name.toLowerCase().includes(searchTerm.toLowerCase())
  );

  return (
    <div style={{ padding: 20 }}>
      <SearchBar searchTerm={searchTerm} onSearchChange={setSearchTerm} />
      <div style={{ display: "flex", flexWrap: "wrap", gap: "15px" }}>
        {filteredProducts.length === 0 ? (
          <p>No products found.</p>
        ) : (
          filteredProducts.map(product => (
            <div key={product.id}
              style={{
                border: "1px solid #ccc",
                borderRadius: "8px",
                width: "220px",
                padding: "10px",
                boxShadow: "2px 2px 8px rgba(0,0,0,0.1)"
              }}
            >
              <img src={product.imageUrl} alt={product.name} style={{ width: "100%", height: 150, objectFit: "cover" }} />
              <h3>{product.name}</h3>
              <p>{product.description}</p>
              <b>₹{product.price}</b>
            </div>
          ))
        )}
      </div>
    </div>
  );
};

export default ProductList;
