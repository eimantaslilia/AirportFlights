# AirportFlights

One of the first programs I wrote where I use a HashMap. I had to write a user interface, where an "admin" can add new planes and their capacities, and then add flight destinations to those planes.
Then, when they exit, a customer's interface is opened, and they're able to print whatever information they want. Single plane or all planes, or all flights.

Created a reader class to make reading input easier.  
Created Planes class where everything else takes place. Inside of it, I have:  
1. A HashMap where I keep the information of plane ID's and their capacities.
2. An ArrayList of flights(Plane ID, Capacity, From-To).
Whenever I needed to add a flight, I added it to a HashMap along with its capacity. Then, when I needed to do something else with it, I would turn that HashMap into an arraylist and print it.
