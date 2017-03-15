package com.javabootcamp;

public class Main{
  public static void main(String[] args){
      HomeStead nkandla = new Nkandla();

      nkandla.setName("Nkandla");
      //and other properties

      Politician jz = new Politician();

      jz.setName("Jacob Zuma");
      jz.setEmployees(new Person.PersonType[]{
        Person.PersonType.ARCHITECT,
        Person.PersonType.LAWYER
      });
      jz.setGender(Person.Gender.MALE);
      jz.setPersonType(Person.PersonType.PRESIDENT);

      Politician hz = new Politician();

      hz.setName("Helen Zille");
      hz.setEmployees(new Person.PersonType[]{
        Person.PersonType.PRESIDENT
      });
      hz.setGender(Person.Gender.FEMALE);
      hz.setPersonType(Person.PersonType.LAWYER);

      //treat these mofos as visitors, which is not really necessary
      Visitor jzv = jz;
      Visitor hzv = hz;

      try{
          nkandla.accept(jzv);
      } catch (UnauthorisedVisitorException e){
          System.err.println(e.getMessage());
      }

      try{
          nkandla.accept(hzv);
      } catch (UnauthorisedVisitorException e){
          System.err.println(e.getMessage());
      }

  }
}
