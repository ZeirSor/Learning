import numpy as np


def sigmoid(x):
    return 1 / (1 + np.exp(-x))


def derivative_sigmoid(x):
    fx = sigmoid(x)
    return fx * (1 - fx)


def mse_loss(y_true, y_pred):
    return ((y_true - y_pred) ** 2).mean()


class Neuron:
    def __init__(self, weight, bias):
        self.weight = weight
        self.bias = bias

    def __call__(self, inputs):
        return self.feedforward(inputs)
    
    def feedforward(self, inputs):
        total = np.dot(self.weight, inputs) + self.bias
        return sigmoid(total)


weight = np.array([0, 1])
bias = 4
n = Neuron(weight, bias)

x = np.array([2, 3])
print(n(x))
