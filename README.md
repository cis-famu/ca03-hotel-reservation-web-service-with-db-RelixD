# Hotel Reservation Web Service with Database

Using the XML document below, create the required Java Classes.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<reservation customerId="34353545" confirmationNo="3453453" completed="2020-08-13T08:29" paymentStatus="PAID" platform="Expedia">
	<checkInDate>2020-09-13T16:00</checkInDate>
	<checkOutDate>2020-09-14T12:00</checkOutDate>
	<reservationName>James Smith</reservationName>
	<adultGuests>4</adultGuests>
	<minorGuests>0</minorGuests>
	<hotelInformation>
		<name>Holiday Inn Savannah</name>
		<address>520 W Bryan Street Savannah GA 31401</address>
		<phone>912-790-1000</phone>
		<rooms>
			<room>
				<floor>3</floor>
				<number>112</number>
				<bedType>2 Queen</bedType>
			</room>
			<room>
				<floor>2</floor>
				<number>345</number>
				<bedType>2 Queen</bedType>
			</room>
		</rooms>
	</hotelInformation>
	<cancellationPolicy>Your booking is non-transferabale, non-refundable, and non-changeable</cancellationPolicy>
</reservation>
```

Using those classes, create a web service that allow the following actions:
- Get a reservation by confirmationNo
- Get all reservations by customerNo
- Get all reservations completed within a data range
- Gell all reservations after a checkin date
- Get all reservations by payment status
- Get all reservations by platform
- Create a new reservation ***(new)***

Be sure to use all the right annotations to make your web service as readable as possible.

Your web service should connect to a Firestore database. **Include your credential file inside your project folder, so I may connect to your database.** Include some data in the database.

# License

[License](LICENSE)