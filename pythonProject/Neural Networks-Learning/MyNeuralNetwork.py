import numpy as np

from Neuron import *


class MyNeuralNetwork:
    def __init__(self):
        weight = np.array([0, 1])
        bias = 0

        self.h1 = Neuron(weight, bias)
        self.h2 = Neuron(weight, bias)

        self.o1 = Neuron(weight, bias)

    def __call__(self, x):
        self._forward(x)

    def _forward(self, x):
        out_h1 = self.h1.feedforward(x)
        out_h2 = self.h2.feedforward(x)

        out_o1 = self.o1.feedforward(np.array([out_h1, out_h2]))

        return out_o1


network = MyNeuralNetwork()
x = np.array([2, 3])
print(network(x))


class MyNeuralNetwork_two:
    def __init__(self):
        self.w1 = np.random.normal()
        self.w2 = np.random.normal()
        self.w3 = np.random.normal()
        self.w4 = np.random.normal()
        self.w5 = np.random.normal()
        self.w6 = np.random.normal()

        self.b1 = np.random.normal()
        self.b2 = np.random.normal()
        self.b3 = np.random.normal()

    def __call__(self, x):
        self._forward(x)

    def _forward(self, x):
        h1 = sigmoid(self.w1 * x[0] + self.w2 * x[1] + self.b1)
        h2 = sigmoid(self.w3 * x[0] + self.w4 * x[1] + self.b2)
        o1 = sigmoid(self.w5 * h1 + self.w6 * h2 + self.b3)
        return o1

    def train(self, data, all_y_trues):
        learn_rate = 0.1
        epoch = 1000

        for epoch in range(epoch):
            for x, y_true in zip(data, all_y_trues):
                sum_h1 = self.w1 * x[0] + self.w2 * x[1] + self.b1
                h1 = sigmoid(sum_h1)

                sum_h2 = self.w3 * x[0] + self.w4 * x[1] + self.b1
                h2 = sigmoid(sum_h2)

                sum_o1 = self.w5 * x[0] + self.w6 * x[1] + self.b1
                o1 = sigmoid(sum_o1)
                y_pred = o1

                dL_d_ypred = -2 * (y_true - y_pred)

                dypred_dw5 = h1 * derivative_sigmoid(sum_o1)
                dypred_dw6 = h2 * derivative_sigmoid(sum_o1)
                dypred_db3 = derivative_sigmoid(sum_o1)

                dypred_dh1 = self.w5 * derivative_sigmoid(sum_h1)
                dypred_dh2 = self.w6 * derivative_sigmoid(sum_h1)

                dh1_dw1 = x[0] * derivative_sigmoid(sum_h1)
                dh1_dw2 = x[1] * derivative_sigmoid(sum_h1)
                dh1_db1 = derivative_sigmoid(sum_h1)

                dh2_dw3 = x[0] * derivative_sigmoid(sum_h2)
                dh2_dw4 = x[1] * derivative_sigmoid(sum_h2)
                dh2_db2 = derivative_sigmoid(sum_h2)

                # update
                self.w1 -= learn_rate * dL_d_ypred * dypred_dh1 * dh1_dw1
                self.w2 -= learn_rate * dL_d_ypred * dypred_dh1 * dh1_dw2
                self.b1 -= learn_rate * dL_d_ypred * dypred_dh1 * dh1_db1

                self.w3 -= learn_rate * dL_d_ypred * dypred_dh2 * dh2_dw3
                self.w4 -= learn_rate * dL_d_ypred * dypred_dh2 * dh2_dw4
                self.b2 -= learn_rate * dL_d_ypred * dypred_dh2 * dh2_db2

                self.w5 -= learn_rate * dL_d_ypred * dypred_dw5
                self.w6 -= learn_rate * dL_d_ypred * dypred_dw6
                self.b3 -= learn_rate * dL_d_ypred * dypred_db3

            if epoch % 10 == 0:
                y_pred = np.apply_along_axis(self._forward, 1, data)
                loss = mse_loss(all_y_trues, y_pred)
                print(f"Epoch {epoch} loss: {loss}")


data = np.array([
    [-2, -1],
    [25, 6],
    [17, 4],
    [-15, -6]
])

all_y_trues = np.array([
    1,
    0,
    0,
    1,
])

network = MyNeuralNetwork_two()
network.train(data, all_y_trues)

emily = np.array([-7, -3])
print(f"emily: {network(emily)}")
frank = np.array([20, 2])
print(f"frank: {network(frank)}")
