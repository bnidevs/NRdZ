# NRdZ
## Bill Ni, Raunak Chowdhury, Maggie Zhao 
### [Our proposal](./proposal.pdf)
---

#### Explanation:
This project simulates the mechanics of the games Tap Titans and Cookie Clicker, with the theme AdVenture Capitalist. The primary objective here is to create a corporate empire with hundreds of Helpers and to amass lots of gold, while staving off natural disasters and robberies.

#### Instructions: 
User starts off on main screen, which will show total gold, total stats from helper, and instructions on how to obtain gold, access store, etc. 
Press [space] and [enter] for gold.
Press [S] and [enter] for store. 
- Will bring user to a separate page, which shows available helpers, upgrades, levels, 
and power ups available for purchase. Each possible purchase will be linked to a separate key.
Press [Q] and [enter] for sorting.
- Will display a table based on a 2D array of helpers with their attributes. Can be 
viewed in ascending or descending order as specified.
Additional instructions will be given on screen if necessary.

Display takes up the entire terminal. Terminal will update with info after every “click” (combo of [space] and [enter]) .

---
## DEVLOG
12/20 	
- The NRdZ were created.

12/21 	
- Inspiration for project chosen- Tap Titans! 

12/22 	
- Trio finalized, GitHub repo created, googform filled out.
  - Program created with rotating ASCII art (may be useful in the future!)
  
01/01 	
- Video call	 
		- Created flowchart
		- Created proposal v1
	- New/modified code: 
  
01/02 	
- Thinker Gathering!
		- Problems and possible solutions:
			- How would we keep track of time elapsed, without using sleep?
				- Keep timestamps of every time [enter] is pressed
			- Do Keyboard.java and Time work together? (ie. can you enter information into the program with time running in the background?)
		- Divvied up roles.
		- Started the inheritance tree for Helper.
	- Video call
		- Clarified differences between levelling and upgrading helpers 
		- Added implementation of sorting → helpers can be sorted 
		- Modified proposal v1.i
		- Problems:
			- Can objects kill themselves? (Needed for unlucky RNG events.)
	- New/modified code: 
  
01/03 	
- Received feedback in class for proposal.
		- (+) detail
		- (+) organization
		- (-) details re: user experience
- Video call
		- Created devlog
		- Created UML diagrams.
		- Amended proposal v2.
	- New/modified code: 
		- First working code! (ish) 
		- Overwrote the basic .gitignore config file
    
01/04	
- Finished UML diagram and proposal
	- New/modified code:
