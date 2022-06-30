class Car:

    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer + " " + self.model + " has started moving")


    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped")


car1 = Car("Swift", "xyz", "2022", "manual", "blue")
car2 = Car("Skoda", "xyz", "2022", "manual", "blue")
car3 = Car("BMW", "xyz", "2022", "manual", "blue")

car1.accelerate()
car2.stop()
