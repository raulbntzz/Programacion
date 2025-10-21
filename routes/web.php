<?php

use App\Http\Controllers\Producto_RBM_Controller;

Route::get('/', [Producto_RBM_Controller::class, 'index'])->name('productos.index');
Route::get('/producto/{id}', [Producto_RBM_Controller::class, 'show'])->name('productos.show');

