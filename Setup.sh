if [ ! -d "bin" ]; then
  mkdir bin
fi

if [ ! -d "bin/main" ]; then
  mkdir bin/main
fi

if [ ! -d "bin/main/images" ]; then
  mkdir bin/main/images
fi

echo Begin to Install...

echo Installing admininster version...
cp -r ./src/main/images/* ./bin/main/images/
javac -d ./bin/main -classpath bin/main ./src/main/application/*.java ./src/main/layout/*.java ./src/main/database/*.java ./src/main/database/entity/*.java ./src/main/database/dao/*.java ./src/main/database/dao/impl/*.java
java -classpath bin/main application.Init
jar cfm BikeShareSystem-Admin.jar ./MANIFEST/MANIFEST-ADMIN.MF -C bin/main .
echo You have successfully installed the Admininster Version!

echo Installing user version...
cp -r ./src/main/images/* ./bin/main/images/
javac -d ./bin/main -classpath bin/main ./src/main/application/*.java ./src/main/layout/*.java ./src/main/database/*.java ./src/main/database/entity/*.java ./src/main/database/dao/*.java ./src/main/database/dao/impl/*.java
java -classpath bin/main application.Init
jar cfm BikeShareSystem-User.jar ./MANIFEST/MANIFEST-USER.MF -C ./bin/main .
echo You have successfully installed the User Version!

echo Installing station version...
cp -r ./src/main/images/* ./bin/main/images/
javac -d ./bin/main -classpath bin/main ./src/main/application/*.java ./src/main/layout/*.java ./src/main/database/*.java ./src/main/database/entity/*.java ./src/main/database/dao/*.java ./src/main/database/dao/impl/*.java
java -classpath bin/main application.Init
jar cfm BikeShareSystem-Station.jar ./MANIFEST/MANIFEST-STATION.MF -C ./bin/main .
echo You have successfully installed the Station Version!

echo The installation has completed.
exit