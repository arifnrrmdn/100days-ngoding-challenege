Let's see about java program convert birthdate to age

✅parse the input string into local object.
LocalDate.parse(string birthdaydate, formatter)

✅use method LocalDate.now() to get current date

✅use Period object to calculate the age using period between birthdate and current date (Period.between(parse, currentdate))

✅ Return getYears() method to get age in years.