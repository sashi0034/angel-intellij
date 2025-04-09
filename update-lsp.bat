@echo off
REM Save the current directory
set "ROOT_DIR=%cd%"

REM Change to the server directory
cd angel-lsp\server

REM Run the bundle script defined in package.json
call npm run bundle

REM Go back to the original directory
cd /d "%ROOT_DIR%"

REM Copy the generated file to the target location
copy /Y angel-lsp\server\angelscript-language-server.js src\main\resources\js\angelscript-language-server.js
