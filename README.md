# ORM
## What's an ORM ?
An ORM (Object/Relational Mapping) is a technique that allows you to query and manipulate data from any database using an object-oriented language.
It greatest feature is that it allows you to handle your database objects as if it was simple local objects. You don't need to write complex SQL queries anymore!

## Object-Relational Impedance Mismatch
Unfortunately, sometimes, it can happen that there is a mismatch between your relational object (in the database) and your object model (written in your favorite language).

It can happens for multiple reasons :
* Granularity : There are a different number of classes and tables
* Inheritance : Not supported by all types of relation databases
* Identity : Problem of primary keys not being the same
* Association : In relation model, association are handled via foreign key. Meanwhile, in object oriented languages, associations are unidirectionnal reference
* Navigation : In object oriented languages, we use associations to navigate through the object network, while in relational model, data can be navigated through via queries joining tables

# JPA

## Introduction

JPA stands for : "Java Persistence API".

JPA is considered to be the standard industry approach for object to relational mapping (ORM).

JPA is, just as J2E, just a specification. It's just a set of interfaces which requires an implementation.

## Persistence ?

For an object to be 'persistent', it has to lives on after the application is shut down. In other words, it means the object is saved in the database just before the application is shut down!

# Spring Data JPA

To illustrate the power of an ORM, we will use Spring implementation of JPA : Spring Data JPA.

## Tools used

First of all, here's a list of all the tools we will need to do this tutorial :
* An IDE : We will use Intellij IDEA here
* Maven
* Spring Boot (to ease the setup of the project)
* Spring Data JPA

## Setup

We will first create a new maven project with Spring Data JPA and Spring boot.
To do it, we will use [Spring Initializr](https://start.spring.io/) here. (which is embedded in Intellij IDEA Ultimate Edition)

![
