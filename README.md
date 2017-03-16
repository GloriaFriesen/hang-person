# Hang-person

#### Hangman inspired Java console game, Current Version: 03/16/2017

#### By Gloria Friesen and Megan Warnock

## Description
This Java application similuates the class Hangman game in the console. The user will enter an individual letter at a time to build an application determined word.

## Setup/Installation Instructions
*


## Specifications

|Behavior|Input|Output|
|:---:|:---:|:---:|
|Application will create a game class|"Game"|new Game|
|Application will create a word|"cat"|cat|
|Application will create a list of letters from the word|"cat"|c, a, t|
|Application will recognize if a given letter matches a letter from the word|"c"|true|
|Application will recognize if a given letter does not match a letter from the word|"d"|false|
|Application adds the given letter to a list containing all letters that have been guessed|"c", "d"|c, d|
|Application will add the given letter to a list of correct letters if it matches a letter in the word|"c"|c|
|Application will recognize if a given letter has already been guessed|"c"|true|
|Application will compare the list of correct letters to the list of letters from the word|"c, t"|false|
|Application will end when the list of correct letters matches the list of letters from the word|"c, a, t"|true|


## Known Bugs
None that I know of.

## Support and contact details
Questions? Concerns? Suggestions? Reach out to us via github.

## Technologies Used
* _Java_

## License
This software is licensed under the MIT license.
Copyright (c) 2017 Gloria Friesen and Megan Warnock.
