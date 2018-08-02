int X = 250;
int Y = 250;
PImage creeper;

void setup(){
  size(548,350);
  PImage woods = loadImage("woods.jpg");
  background(woods);
}

void draw(){
   PImage woods = loadImage("woods.jpg");
  background(woods);
  creeper=loadImage("creeper.png");
  creeper.resize(20,20);
  image(creeper,X,Y);
 if(mousePressed){
if(dist(X,Y,mouseX,mouseY)<40){
  fill(85,170,000);
  ellipse(mouseX,mouseY,10,10);
  println("You found the Creeper!");
} else{
  fill(221,000,000);
  ellipse(mouseX,mouseY,10,10);
}
 }
}