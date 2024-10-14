import foods from './foods.mjs';
const getAllCategories = [...new Set(foods.map(food => food.category))];
console.log(getAllCategories);

const checkIfExistsCategory = (category) => getAllCategories.includes(category);
console.log(checkIfExistsCategory("Italian")); // Print true
console.log(checkIfExistsCategory("Spanish")); // Print false

const findCategory = (category) => foods.filter((food) => (food.category === category));
console.log(findCategory('Fast Food'));

const ticket = ['🥜', '🌮', '🥗', '🍕', '🍣', '🧀'];
// Expected output: Total of the ticket: ["🥜","🌮","🥗","🍕","🍣","🧀"] is $52.48 
// Function to calculate the total of the ticket
const calculateTotalTicket = (ticket, foods) =>
	ticket
		// Find the food corresponding to the icon
		.map((item) => foods.find((food) => food.icon === item)) 
		// Filter out items that were not found
		.filter(Boolean) 
		// Sum up the prices
		.reduce((total, food) => total + food.price, 0); 

// Calculate the total of the ticket
const totalTicket = calculateTotalTicket(ticket, foods);
console.log(
	`Total of the ticket: ${JSON.stringify(ticket)} is $${totalTicket.toFixed(2)}`
);