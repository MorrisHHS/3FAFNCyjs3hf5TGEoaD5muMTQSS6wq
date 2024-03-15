@echo off
:: Define the lazygit function
:lazgit
git pull
git add .
git commit -a -m "%1"
git push
goto :eof
