

## Controllers(API LAYER)

1) UserRegisterController - > use to onboard the user/client

2) DriverController -> use to onboard Drivers

3) FindRideController -> Find and Book the ride nearest ride, if no ride is available then it handles that scenatrio too



## Testcases

client functionality tests

{
    "clientid" : 124,
	"clientname": "shrikant",
	"emailid" : "shrikantpadhy18@gmail.com",
	"address":"kalyan"
}

{
    "clientid" : 125,
	"clientname": "aakash",
	"emailid" : "aakash18@gmail.com",
	"address":"mumbai"
}

{
    "clientid" : 126,
	"clientname": "prithvi",
	"emailid" : "prithvi17@gmail.com",
	"address":"mumbai"
}

example output : 
{
    "CODE": 200,
    "MESSAGE": "Client successfully added"
}



Driver functionality tests

{
    "driverid" : 300,
	"name": "Raj",
	"age" : 22,
	"gender":"M",
    "vehicleInfo" : "skoda:AO0182",
    "coordinates":[1,2]
}

{
    "driverid" : 301,
	"name": "Rahul",
	"age" : 32,
	"gender":"M",
    "vehicleInfo" : "SUV:AO0182",
    "coordinates":[2,5]
}

{
    "driverid" : 302,
	"name": "mehul",
	"age" : 37,
	"gender":"M",
    "vehicleInfo" : "TATA:AO0182",
    "coordinates":[4,7]
}

example output:

{
    "CODE": 200,
    "MESSAGE": "Driver Details successfully added"
}

find and book 
scaenario1 :

{
    "username" : "shrikant",
	"source": [2,5],
	"destination" : [4,5]
	
}

{
    "CODE": 200,
    "MESSAGE": "Ride booked, Driver ID :  301"
}


scenario2 : when no rides are available
{
    "username" : "mangesh",
	"source": [18,5],
	"destination" : [4,5]
	
}

output

{
    "CODE": 500,
    "MESSAGE": "No Ride Available"
}


