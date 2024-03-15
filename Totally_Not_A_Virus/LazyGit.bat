@echo off
:: Define the lazygit function
:lazgit
cd "%~dp0\Project"
git pull --merge
git add .
git commit -a -m "%1"
git push
cd ..
goto :eof
