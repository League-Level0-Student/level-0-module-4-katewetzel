void setup(){
  size(500,200);
}

void draw(){
  background(170,187,187);
  if(mouseX>=230){
    mouseX=150;
  }
  if(mouseX<=70){
    mouseX=150;
  }
  if(mouseY>=150){
    mouseY=100;
  }
  if(mouseY<=50){
    mouseY=100;
  }
 fill(255,255,255);
  ellipse(150,100,150,100);
  ellipse(350,100,150,100);
  fill(000,000,000);
  ellipse(mouseX,mouseY,40,40);
  ellipse(mouseX+200,110,40,40);
  
}