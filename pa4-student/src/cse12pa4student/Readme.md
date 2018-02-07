I use the reference implementation from piazza. The 'time' helper method calls and records
System.nanoTime() both before and after calling the mystery methods and calculates the running time by subtracting start-time from end-time.
The measure method creates new Measurement with the results returned by helper method and adds the object into a list.
measurementToCSV converts the list to readable Strings.
By calling measure method and measurementToCSV method in the main class, we're able to print the result in the console.