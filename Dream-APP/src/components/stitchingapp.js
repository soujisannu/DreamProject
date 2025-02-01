import React, { useState } from "react";
import { Link } from "react-router-dom"; // Import Link for navigation
import logo from "../assets/logo.png"; // Adjust this path to match where your logo is stored
import Button from "./ui/button"; // No curly braces for default export
import Card from "./ui/card";     // No curly braces for default export

const StitchingApp = () => {
  const [category, setCategory] = useState('women'); // Default category is 'women'

  const womenServices = [
    {
      title: 'Blouse Stitching',
      description: 'Custom Blouse Stitching With Perfect Fit And Design.',
    },
    {
      title: 'Salwar Stitching',
      description: 'Professional Salwar Stitching With Customization Options.',
    },
    {
      title: 'Dress Stitching',
      description: 'Beautiful Dress Stitching For All Occasions.',
    },
  ];

  const kidsServices = [
    {
      title: 'Kids Shirt Stitching',
      description: 'Comfortable and stylish shirts for kids.',
    },
    {
      title: 'Kids Trouser Stitching',
      description: 'Tailored trousers for kids of all ages.',
    },
    {
      title: 'Kids Dress Stitching',
      description: 'Custom dresses for kids for all occasions.',
    },
    {
      title: 'Kids Jacket Stitching',
      description: 'Warm and stylish jackets for kids.',
    },
  ];

  const servicesToDisplay = category === 'women' ? womenServices : kidsServices;

  return (
    <div className="App">
      {/* Header */}
      <header>
        <div className="container">
          <img src={logo} alt="Sandhya Fashion Designer Logo" />
          <h1>Sandhya Fashion Designer</h1>
          <nav>
            <Link to="/" className="button">Home</Link>
            <Link to="/place-order" className="button">Place Order</Link>
            <Link to="/track-order" className="button">Track Order</Link>
            <Link to="/my-orders" className="button">My Orders</Link>
          </nav>
        </div>
      </header>

      {/* Hero Section */}
      <section className="hero container">
        <h2>Professional Stitching Services at Your Fingertips</h2>
        <p>Get your clothes stitched perfectly with our expert tailoring services. Easy ordering, perfect fitting.</p>
        <div className="button-group">
          <Link to="/place-order"><Button>Place Order Now</Button></Link>
          <Link to="/track-order"><Button>Track Order</Button></Link>
        </div>
      </section>

      {/* Filter Section */}
      <div className="filter">
        <button onClick={() => setCategory('women')}>Women</button>
        <button onClick={() => setCategory('kids')}>Kids</button>
      </div>

      {/* Services Section */}
      <section className="container">
        <div className="services-grid">
          {servicesToDisplay.map((service, index) => (
            <Card key={index}>
              <h4>{service.title}</h4>
              <p>{service.description}</p>
              <Link to="/place-order"><Button>Select Model</Button></Link>
            </Card>
          ))}
        </div>
      </section>

      {/* Footer */}
      <footer>
        <div className="container">
          <h3>Sandhya Fashion Designer</h3>
          <p>Professional stitching services with perfect fit guarantee.</p>
          <div className="footer-grid">
            <div>
              <h4>Services</h4>
              <ul>
                <li>Blouse Stitching</li>
                <li>Salwar Stitching</li>
                <li>Dress Stitching</li>
                <li>Alterations</li>
              </ul>
            </div>
            <div>
              <h4>Contact</h4>
              <address>
                <p>123 Stitching Street</p>
                <p>Hyderabad, 500090</p>
                <p>Phone: +91 81797 43291</p>
                <p>Email: Sannusandhyarani@gmail.com</p>
              </address>
            </div>
            <div>
              <h4>Quick Links</h4>
              <ul>
                <li><Link to="/place-order">Place Order</Link></li>
                <li><Link to="/track-order">Track Order</Link></li>
                <li>Measurements Guide</li>
                <li>FAQs</li>
              </ul>
            </div>
          </div>
          <p className="copyright">© 2025 Sandhya Fashion Designer Services. All rights reserved.</p>
        </div>
      </footer>
    </div>
  );
};

export default StitchingApp;
