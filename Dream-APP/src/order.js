import React, { useState } from 'react';
import { db } from './firebase'; // Import Firestore from firebase.js
import { collection, addDoc } from 'firebase/firestore';

const Order = () => {
  const [orderDetails, setOrderDetails] = useState({ name: '', service: '', price: '' });

  const handleInputChange = (e) => {
    const { name, value } = e.target;
    setOrderDetails({ ...orderDetails, [name]: value });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const docRef = await addDoc(collection(db, "orders"), orderDetails);
      console.log("Order placed with ID: ", docRef.id);
    } catch (e) {
      console.error("Error adding document: ", e);
    }
  };

  return (
    <div>
      <h2>Place Your Order</h2>
      <form onSubmit={handleSubmit}>
        <input 
          type="text" 
          name="name" 
          value={orderDetails.name} 
          onChange={handleInputChange} 
          placeholder="Your Name" 
        />
        <input 
          type="text" 
          name="service" 
          value={orderDetails.service} 
          onChange={handleInputChange} 
          placeholder="Service" 
        />
        <input 
          type="text" 
          name="price" 
          value={orderDetails.price} 
          onChange={handleInputChange} 
          placeholder="Price" 
        />
        <button type="submit">Place Order</button>
      </form>
    </div>
  );
};

export default Order;
