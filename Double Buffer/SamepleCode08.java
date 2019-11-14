Stage stage;

Comedian harry = new Comedian();
Comedian baldy = new Comedian();
Comedian chump = new Comedian();

harry.face(baldy);
baldy.face(chump);
chump.face(harry);

stage.add(harry, 0);
stage.add(baldy, 1);
stage.add(chump, 2);
