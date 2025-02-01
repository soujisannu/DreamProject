// components/ui/button.jsx
import React from 'react';

const Button = ({ children, onClick, className }) => {
  return (
    <button 
      onClick={onClick} 
      className={`bg-pink-400 text-white px-6 py-3 rounded-full hover:bg-pink-500 transition-colors ${className}`}
    >
      {children}
    </button>
  );
};

export default Button;

// components/ui/card.jsx
import React from 'react';

const Card = ({ children, className }) => {
  return (
    <div className={`bg-white p-6 rounded-xl shadow-lg hover:transform hover:-translate-y-2 transition-transform ${className}`}>
      {children}
    </div>
  );
};

export default Card;

// App.jsx
import React from "react";
import StitchingApp from "./components/StitchingApp";
import "./global.css";

function App() {
  return <StitchingApp />;
}

export default App;

// components/StitchingApp.jsx
import React from "react";
import Card from "./ui/card";
import Button from "./ui/button";

const StitchingApp = () => {
  return (
    <div className="min-h-screen bg-pink-50">
      {/* Header */}
      <header className="bg-pink-400 text-white p-5 shadow-md">
        <div className="container mx-auto text-center">
          <img 
            src="/logo.png" 
            alt="Sandhya Fashion Designer Logo" 
            className="mx-auto w-44 h-auto mb-4"
          />
          <h1 className="text-3xl font-bold mb-4">Sandhya Fashion Designer</h1>
          <nav className="flex justify-center gap-4 flex-wrap">
            <Button>Home</Button>
            <Button>Place Order</Button>
            <Button>Track Order</Button>
            <Button>My Orders</Button>
          </nav>
        </div>
      </header>

      {/* Hero Section */}
      <section className="container mx-auto py-12 px-4">
        <div className="text-center">
          <h2 className="text-3xl font-bold text-gray-800 mb-4">
            Professional Stitching Services at Your Fingertips
          </h2>
          <p className="text-gray-600 mb-6">
            Get your clothes stitched perfectly with our expert tailoring services. Easy ordering, perfect fitting.
          </p>
          <div className="flex justify-center gap-4">
            <Button>Place Order Now</Button>
            <Button>Track Order</Button>
          </div>
        </div>
      </section>

      {/* Services Section */}
      <section className="container mx-auto py-12 px-4">
        <div className="grid grid-cols-1 md:grid-cols-3 gap-8">
          <Card>
            <h4 className="text-xl font-bold text-pink-500 mb-2">Blouse Stitching</h4>
            <p className="text-gray-600 mb-4">Custom blouse stitching with perfect fit and design.</p>
            <Button>Order Now</Button>
          </Card>
          <Card>
            <h4 className="text-xl font-bold text-pink-500 mb-2">Salwar Stitching</h4>
            <p className="text-gray-600 mb-4">Professional salwar stitching with customization options.</p>
            <Button>Order Now</Button>
          </Card>
          <Card>
            <h4 className="text-xl font-bold text-pink-500 mb-2">Dress Stitching</h4>
            <p className="text-gray-600 mb-4">Beautiful dress stitching for all occasions.</p>
            <Button>Order Now</Button>
          </Card>
        </div>
      </section>

      {/* Footer */}
      <footer className="bg-pink-400 text-white py-8 px-4">
        <div className="container mx-auto text-center">
          <h3 className="text-2xl font-bold mb-4">Sandhya Fashion Designer</h3>
          <p className="mb-6">Professional stitching services with perfect fit guarantee.</p>
          <div className="grid grid-cols-1 md:grid-cols-3 gap-8">
            <div>
              <h4 className="font-bold mb-2">Services</h4>
              <ul>
                <li>Blouse Stitching</li>
                <li>Salwar Stitching</li>
                <li>Dress Stitching</li>
                <li>Alterations</li>
              </ul>
            </div>
            <div>
              <h4 className="font-bold mb-2">Contact</h4>
              <address className="not-italic">
                <p>123 Stitching Street</p>
                <p>Hyderabad, 500090</p>
                <p>Phone: +91 81797 43291</p>
                <p>Email: Sannusandhyarani@gmail.com</p>
              </address>
            </div>
            <div>
              <h4 className="font-bold mb-2">Quick Links</h4>
              <ul>
                <li>Place Order</li>
                <li>Track Order</li>
                <li>Measurements Guide</li>
                <li>FAQs</li>
              </ul>
            </div>
          </div>
          <p className="mt-8">© 2025 Sandhya Fashion Designer Services. All rights reserved.</p>
        </div>
      </footer>
    </div>
  );
};

export default StitchingApp;