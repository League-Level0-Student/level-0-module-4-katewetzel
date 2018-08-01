PImage creeper;

void setup(){
  size(548,350);
  PImage woods = loadImage("woods.jpg");
  background(woods);
}

void draw(){
  creeper=loadImage("creeper.png");
  image(creeper,mouseX,mouseY);
  creeper.resize(50,50);
}

#6