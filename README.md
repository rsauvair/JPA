# JPA

## ORM
### What's an ORM ?
An ORM (Object/Relational Mapping) is a technique that allows you to query and manipulate data from any database using an object-oriented language.
It greatest feature is that it allows you to handle your database objects as if it was simple local objects. You don't need to write complex SQL queries anymore!

### Object-Relational Impedance Mismatch
Unfortunately, sometimes, it can happen that there is a mismatch between your relational object (in the database) and your object model (written in your favorite language).

It can happens for multiple reasons :
* Granularity : There are a different number of classes and tables
* Inheritance : Not supported by all types of relation databases
* Identity : Problem of primary keys not being the same
* Association : In relation model, association are handled via foreign key. Meanwhile, in object oriented languages, associations are unidirectionnal reference
* Navigation : In object oriented languages, we use associations to navigate through the object network, while in relational model, data can be navigated through via queries joining tables


In this tutorial we are going to use J2E most known ORM : Spring Data JPA.

## JPA

### Introduction

