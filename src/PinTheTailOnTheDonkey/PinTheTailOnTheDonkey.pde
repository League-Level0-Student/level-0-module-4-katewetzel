PImage donkey;
PImage tail;


void setup(){
  donkey = loadImage("donkey.jpg");
  tail = loadImage("tail.png");
  size(550,406);
}

void draw(){
 
  if(dist(0,0,mouseX,mouseY)<30){
    background(donkey);
    image(tail,mouseX-140,mouseY-40);
  rect(0,0,30,30);
  rect(454,75,40,40);
  } else {
    background(255,255,255);
    image(tail,mouseX-140,mouseY-40);
  }
  if(dist(454,75,mouseX,mouseY)<40){
    background(donkey);
    image(tail,mouseX-140,mouseY-40);
}
}