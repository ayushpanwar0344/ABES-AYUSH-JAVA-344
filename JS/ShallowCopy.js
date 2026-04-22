const o = {
    name:"Ayush",
    age:20,
    address:{
        city:"Delhi",
    }
}
 const sh = {...o} //shallow copy

 //modify
 sh.address.city = "Ghaziabad";
 console.log(o);
 console.log(sh);
