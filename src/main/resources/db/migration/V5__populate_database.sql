INSERT INTO categories (name)
VALUES ('Fruits & Vegetables'),
       ('Dairy & Eggs'),
       ('Bakery'),
       ('Meat & Seafood'),
       ('Pantry Staples'),
       ('Beverages'),
       ('Snacks'),
       ('Frozen Foods'),
       ('Health & Beauty'),
       ('Household Essentials');

INSERT INTO products (name, price, description, category_id)
VALUES ('Organic Bananas', 1.29, 'Fresh organic bananas, rich in potassium and perfect for smoothies or snacks.', 1),
       ('Whole Milk 1 Gallon', 3.49, 'Creamy, hormone-free whole milk sourced from local dairy farms.', 2),
       ('Sourdough Bread Loaf', 4.25, 'Crusty, hand-baked sourdough loaf with a soft tangy center.', 3),
       ('Boneless Skinless Chicken Breasts (1 lb)', 6.99,
        'All-natural, cage-free chicken breasts trimmed and ready to cook.', 4),
       ('Extra Virgin Olive Oil 500ml', 9.99, 'Cold-pressed Mediterranean olive oil, ideal for salads and cooking.', 5),
       ('Sparkling Water Lime (12-pack)', 7.49, 'Refreshing zero-calorie lime sparkling water in recyclable cans.', 6),
       ('Potato Chips Sea Salt 8oz', 3.79, 'Crispy kettle-cooked potato chips seasoned with sea salt.', 7),
       ('Frozen Mixed Berries 16oz', 5.99,
        'Blend of strawberries, blueberries, and raspberries for smoothies or desserts.', 8),
       ('Toothpaste Fresh Mint 6oz', 2.99, 'Fluoride toothpaste with long-lasting fresh mint flavor for healthy gums.',
        9),
       ('Paper Towels 6-Pack', 8.49, 'Strong and absorbent paper towels for everyday cleaning tasks.', 10);
