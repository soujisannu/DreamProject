import React from "react";
import { Route, Routes } from "react-router-dom"; // No need to import BrowserRouter here
import StitchingApp from "./components/stitchingapp"; // Main page
import PlaceOrder from "./components/PlaceOrder"; // Place order page
import TrackOrder from "./components/TrackOrder"; // Track order page
import MyOrders from "./components/MyOrders"; // My orders page
import "./global.css";

function App() {
  return (
    <div className="app">
      <Routes> {/* BrowserRouter already included in index.js */}
        <Route path="/" element={<StitchingApp />} />
        <Route path="/place-order" element={<PlaceOrder />} />
        <Route path="/track-order" element={<TrackOrder />} />
        <Route path="/my-orders" element={<MyOrders />} />
      </Routes>
    </div>
  );
}

export default App;
