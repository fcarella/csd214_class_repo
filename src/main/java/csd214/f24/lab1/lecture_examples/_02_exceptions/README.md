# Exception hierarchy for Person class
- [chatgpt link...](https://chat.openai.com/share/a740cbac-7e02-4723-9492-83e1facc4100)
- chatgpt prompt
> show me an exception class hierarchy for dealing with  a Person class
## more info... 
- In this example:
  - InvalidAgeException and InvalidNameException are specific exceptions 
for handling cases where the age or name of a person is considered 
invalid.
  - PersonNotFoundException is a specific exception for situations where a person is not found, and PersonAlreadyExistsException is for cases where a person is already registered.
  - PersonException is a more general exception that can be used as a base class for exceptions related to the Person class. You can customize and expand this hierarchy based on the specific requirements and scenarios in your application. When using these exceptions, you can catch them selectively to handle different types of issues related to the Person class.
  - 