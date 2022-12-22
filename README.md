# Full Stack Assesment (Full Time)

## Introduction

You will be implementing an Android application using Android Studio that will call the national
weather api and populate the forecast on a screen.

All reasources have been provided to you. It will be your job to implement these resources into a
functioning weather forecast app.

This should take a few hours to complete, please keep track of your time as you go and get as much
done as you can.

## The UI

The following are the two screens we would like to see implemented.
<p align=center>
  <img src="https://user-images.githubusercontent.com/82067568/206309377-a61e7589-857d-4a77-8371-3547c471d228.png" height = "500">
</p>

### Screen #1

Should be implmented as closely as possible to the provided screen. Margins, text size, and shades
of colors don't have to be precise.

### Screen #2

Should consist of a textview on top and a recyclerview on the remainder of the screen.

Every forecast should have a corresponding:

- icon
- time of day
- temperature

If the Api fails to call then display the failure in the textView

## Function

When Screen #1's forecast button is pressed the application should initialize the forecast activity,
which will call the national weather api for the forecast of a given location.

Calling the weather api is a two step process.

- The first step is to send a location request. The response will be two grid cooordinates.

- The second step will be to send a forescast request with the previously given grid coordinates.
  The response will be the finale forecast for the next couple of days.

Please reference the following link: https://weather-gov.github.io/api/general-faqs

## When Finished

When you have completed the assessment, email molly@ascentitech.com with the link to your new
repository and answer the following questions as honestly as you can.

## Final Questions

1) How long did the assessment take to complete? Was there any task that took significantly longer
   than the others, and if so why?
2) Were there any tasks that you initially did not know how to complete? And if so, how did you
   approach them and take the steps to learn how to complete them?
3) Was this assessment feasible for the time given and relatively easy to follow? Any points of
   feedback?

Ans 1: Took me an afternoon to finish all the feature. I waste some time on doing some GPS stuff.
However, it seems like we didn't need to use correct current location(latitude, longtitude) of the
user. Also spent some time on debugging for the original code. It seems like some pre-defined
functionality doesn't work... Hence, I re-write it to my own version. I also spent time on changing
some layout stuff.

Ans 2: It's been a while that I haven't write Android App; therefore, I have to some materials
again. The approach is review Google Official API Doc and some tutorial video.

Ans 3: This assessment isn't too hard for who have Android App experience. And I also waste sometime
on building ask for GPS accessing stuff; however we don't need that feature on this App. For people
with 0 experience, I think they will need to spend lots of time to get to know how to use Android
Studio, and how to do some UI stuff.

Heads up, first time the app will be a bit slow, cause the redundant feature I added(getting current
location) takes time to finish.