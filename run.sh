#!/bin/bash

ant
cd bin
java mg/main/Main ../data/data.csv ../data/sequence.csv
