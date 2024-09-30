# Installation
No problem with installation of MongoDB, and decided to use MongoDB Compass and mongosh from cmd.  
# Experiment 1
## Screenshots 1
### Insert
![InsertCompass](./images/Insertcompass.png)
![InsertMongosh](./images/Insertmongosh.png)

### Query
![Query](./images/queryCommands.png)

### Update
![Update](./images/update.png)

### Remove documents
![delete](./images/delete.png)

### Bulk Write
![BulkUpdate](./images/BulkUpdate.png)


# Experiment 2 
## Screenshots
### Example given
NOTE: That the tutorial has mapReduce which is deprecated, so I did it with a aggregation pipeline instead. 
![exampleAggregate](./images/exampleaggregate.png)

### My own aggregate function
This first finds all the customers that have had orders for a total more than 100, to see who spends the most. 
![spenthundredormore](./images/spenthundredormore.png)

The second one finds all the customers that have bought an orange, to see which customers that buys oranges. 
![checkwhooranges](./images/checkwhobuysoranges.png)

# Issues
Did the first experiment on the local db, ran into trouble in experiment 2, and now I know that I should not use the local db. 

