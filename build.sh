cd 445hw3s
sudo apt-get -y update
sudo apt-get -y install openjdk-17-jdk

sudo snap install gradle --classic
./gradlew clean build
./gradlew run