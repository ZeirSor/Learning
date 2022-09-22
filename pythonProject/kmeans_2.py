import matplotlib.pyplot as plt
from sklearn.datasets import make_blobs
X, y, true_centers = make_blobs(n_samples=150, centers=3, n_features=2, random_state=0, return_centers=True)
plt.scatter(X[:, 0], X[:, 1])
plt.show()

plt.scatter(X[ :, 0]，X[ :,1]，c=y)
plt.scatter(means[:，0], means[:，1], marker= 'x ', alpha=1., c='n ', label='means ', linewidths=3plt.scatter(true_centers[:，0], true_centers[:，1], marker='x ', alpha=1, c='blue', label= 'true')plt.legend()
plt.show()
print(f'iters: {len(model.iter_means)} ')
