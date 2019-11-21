Entity skeleton;
bool patrollingLeft = false;
double x = 0;

// Main game loop:
while (true) {
  if (patrollingLeft) {
    x--;
    if (x == 0) patrollingLeft = false;
  } else {
    x++;
    if (x == 100) patrollingLeft = true;
  }

  skeleton.setX(x);

  // Handle user input and render game...
}
