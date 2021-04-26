# Project Report

Colin Ferguson

## Challenge #1 Complete

For Challenge 1 I had to change the Query Engine so that it uses WikipediaQueryEngine 
instead of FakeQueryEngine. This was pretty simple since all I had to do was go into 
the QueryEngineModule class, import WikipediaQueryEngine, and then replace the bind FakeQueryEngine
line with the imported WikipediaQueryEngine instead

## Challenge #2 Incomplete

I really struggled with this one. I just don't really understand what it means by "the dependency opposes
the flow of the execution". So I just tried to create a new module that is injected along with the
QueryEngineModule and also trying to change the date and time to be read more easily. 

## Challenge #3 Complete

I think I did this correctly. The point is to take parts of the previous StringBuilder code and combine
it with java collections, and the map function to be able to combine it all onto one line to make it look
functional.

## Reflection Question #1: Functional vs OO

This is really the first class where I've used functional programming, and I'm not really a fan. I feel that
since I started with the OO style its just hard to change my way of thinking when I'm used to and more
comfortable with OO. I understand the point of using functional programming in certain scenarios, but it 
just seems more complicated and messy compared to OO.

## Reflection Question #2: Polymorphism and Dependency Inversion



