
SYED CHANDPASHA@SKP-PC MINGW64 ~/OneDrive/Desktop/MYGIT (master)
$ git status;
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        Demo.java
        Demo.java.txt
        Test.html.txt

nothing added to commit but untracked files present (use "git add" to track)

SYED CHANDPASHA@SKP-PC MINGW64 ~/OneDrive/Desktop/MYGIT (master)
$ git status;
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        Demo.java

nothing added to commit but untracked files present (use "git add" to track)

SYED CHANDPASHA@SKP-PC MINGW64 ~/OneDrive/Desktop/MYGIT (master)
$ git add Demo.java;

SYED CHANDPASHA@SKP-PC MINGW64 ~/OneDrive/Desktop/MYGIT (master)
$ git status;
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   Demo.java


SYED CHANDPASHA@SKP-PC MINGW64 ~/OneDrive/Desktop/MYGIT (master)
$ git config --global user.name "SyedKhadeerPasha017"

SYED CHANDPASHA@SKP-PC MINGW64 ~/OneDrive/Desktop/MYGIT (master)
$ git config --global user.email "khadeerpasha017@gmail.com"

SYED CHANDPASHA@SKP-PC MINGW64 ~/OneDrive/Desktop/MYGIT (master)
$ git commit -m "first commit"
[master (root-commit) f4262b7] first commit
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 Demo.java

SYED CHANDPASHA@SKP-PC MINGW64 ~/OneDrive/Desktop/MYGIT (master)
$ git branch -M main

SYED CHANDPASHA@SKP-PC MINGW64 ~/OneDrive/Desktop/MYGIT (main)
$ git remote add origin https://github.com/SyedKhadeerPasha017/My-Project.git

SYED CHANDPASHA@SKP-PC MINGW64 ~/OneDrive/Desktop/MYGIT (main)
$ git push -u origin main
Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Writing objects: 100% (3/3), 219 bytes | 109.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
To https://github.com/SyedKhadeerPasha017/My-Project.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.

SYED CHANDPASHA@SKP-PC MINGW64 ~/OneDrive/Desktop/MYGIT (main)
$ git status
On branch main
Your branch is up to date with 'origin/main'.

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        Home.java
        Test.java

nothing added to commit but untracked files present (use "git add" to track)

SYED CHANDPASHA@SKP-PC MINGW64 ~/OneDrive/Desktop/MYGIT (main)
$ git add --a

SYED CHANDPASHA@SKP-PC MINGW64 ~/OneDrive/Desktop/MYGIT (main)
$ git status
On branch main
Your branch is up to date with 'origin/main'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   Home.java
        new file:   Test.java


SYED CHANDPASHA@SKP-PC MINGW64 ~/OneDrive/Desktop/MYGIT (main)
$
