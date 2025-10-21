<?php

namespace App\Http\Controllers;

use App\Models\Producto_RBM;
use Illuminate\Http\Request;

class Producto_RBM_Controller extends Controller
{
    public function index()
    {
        $productos = Producto_RBM::all();
        return view('productos.index', compact('productos'));
    }

    public function show($id)
    {
        $producto = Producto_RBM::findOrFail($id);
        return view('productos.show', compact('producto'));
    }
}
