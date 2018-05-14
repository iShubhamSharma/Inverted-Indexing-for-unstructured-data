# Inverted-Indexing-for-unstructured-data
"Optimized Indexing of unstructured data for Data Lake environment" is a project which is going to deal with indexing pool of unstructured data in Data Lake environment. Data Lake is a repository which hold vast amount of data in its native form. The idea of data lake is to have a single storehouse of all data in an enterprise ranging from the raw data to transformed data which is used for various purposes including visualization, machine learning, analytics and reporting. This project begins with using unstructured data sets containing data in native format, and then indexing it by Inverted Indexing technique using Hashing so as to get optimized results in speed and time.

## The objective is to :-

## First Stage:   
1) To research about existing Indexing algorithms and to find their pros and cons.
2) To implement existing indexing techniques and to study and compare when to use a particular indexing approach.

## Second Stage: 
1) Optimize an Indexing Approach.

## Third Stage: 
1) Computing the space time complexity factor and to find out the accuracy of result returned by the optimized indexing approach

## Existing System Requirement

The existing system under which the Minor is being developed has configuration 
details as follows : 
* RAM: 8GB 
* System Type: 64-bit Operating System
* Processor: Intel Core i5
The results obtained, speed and time complexity depend on the system configuration as 
well.

## Implementation
* After analyzing and executing various indexing approaches, the approach optimized is Inverted Indexing using Hashing and it has proved to be an efficient approach.
* It is fast, memory-efficient and is able to index multiple documents in a single cycle. 
The devised approach has outperformed Apache Lucene in terms of time complexity. 


## How Inverted Index Works:

1.	Fetching the Document
2.	Removing the Stop Words
3.	Stem to the Root Word
4.	Record Document

## DataSets Used In the project are attached in the Data.txt file, some of the data sets include:-
* CrpytoCurrency Data
* ECommerce Sales Data
* AirQuality of the states of India
* StackOverflow Survery Result, etc

## Time & Space Complexity of Our Approach V/S Existing
* HashMap generally have no size limit (that is, you can store an unbounded number of things in it).

* Searching takes O(1) time in HashMap as compared to O(n) in Array and LinkedList or O(log(n)) in B-Tree.

* Apache Lucene makes use of Skip List data structure which takes O(log(n)) time in searching.

