let str = `Persona 1 13123123 “Pérez” “Jorge” “Juan B Justo 1234”
Persona 2 13123123 “Pérez” “Jorge” “Juan B Justo 1234”
Persona 3 13123123 “Benítez” “Joaquín” “Córdoba 4321”
Persona 4 12456789 “Finos” “Juana” “Colón 1357”
Persona 5 14567891 “Roble” “Lucía” “Edison 9512”
Persona 6 14954985 “Roble” “Lucía” “Edison 9512”
Persona 7 44989598 “Iniesta” “Mariano” “Corrientes 3846”
Persona 8 44989598 “Chico” “Gimena” “Almafuerte 1499”
Persona 9 96151965 “Quiroga” “Gloria “Almafuerte 1499”
Persona 10 29899622 “Ubeda” “Lucas” “Paunero 3166”
Persona 11 26484631 “Villalba” “Jaime” “Tucumán 2360”`

let arr = str
  .replaceAll('“', '"')
  .replaceAll('”', '"')
  .split("\n");

arr = arr.map(e => e.split(" ").slice(2).join(" "))

arr = arr.map(e => e.split(/\s"/).join(", \""))
arr = arr.map(e => "new Persona(" + e + "), ")

for (let s of arr)
  console.log(s)