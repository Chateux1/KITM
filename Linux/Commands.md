Various commands
================

Chapter 6 - Working with Files and Directories
----------------------------------------------

- pwd (print working directory)
- \ls (escape ls --color=auto alias and display all contents in white text color)
- ls -a (display all files, including hidden files)
- ls -l (display files and their metadata)
- ls -lh (human readable file size)
- ls -R (display files and subdirectories)
- ls -lSh (list, sort by size, human readable)
- ls -lrt (list, reverse, time modified)
- cp -vinr [source] [destination] (copy, produce output, interactive, no overwrite, remove)
- mv -vin [source] [destination] (move, ...)
- rm -i (remove filename or glob)
- rm -ri (remove directory)
- rmdir (remove empty directory)
- touch (create new file)

Chapter 8 - Pipes, Redirection, and REGEX
-----------------------------------------

* less (more)
    * h = help
	* q = quit
	* b = window backwards
	* space = window forward
	* enter = line forward

* search in less command
	* / = start search forward (type + enter)
	* ? = start search backwards
	* n = next search
	* N = previous search
	
* head/tail advanced
	* head /etc/passwd 			First ten lines of /etc/passwd
	* head -3 /etc/group 		First three lines of /etc/group
	* head -n 3 /etc/group 		First three lines of /etc/group
	* help | head 				First ten lines of output piped from the help command
	* tail /etc/group 			Last ten lines of /etc/group
	* tail -5 /etc/passwd 		Last five lines of /etc/passwd
	* tail -n 5 /etc/passwd 	Last five lines of /etc/passwd
	* help | tail 				Last ten lines of output piped from the help command





**File type explanation:**

- d 	directory 	A file used to store other files.
- "-" 	regular file 	Includes readable files, images files, binary files, and compressed files.
- l 	symbolic link 	Points to another file.
- s 	socket 	Allows for communication between processes.
- p 	pipe 	Allows for communication between processes.
- b 	block file 	Used to communicate with hardware.
- c 	character file 	Used to communicate with hardware.