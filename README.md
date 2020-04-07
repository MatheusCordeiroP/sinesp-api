# SINESP-API

This project is for implantation of an API, i get the SINESP API from https://directintelligence.com.br/
the SINESP allows to get some information about a car using it's license plate.

*This API works only for Brazil*

You can use this project as you want, just talk with direct intelligence to get a token key, as long this API is not public.

## Demo Gif
![](sinesp-api.gif)

## How it works
This project make a request to direct intelligence sending the license plate.
Retrofit to convert the returned result from Json to an object, so you can get the information and manipulate as you want.
