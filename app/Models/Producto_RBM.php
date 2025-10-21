<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Producto_RBM extends Model
{
    use HasFactory;

    protected $table = 'productos_rbm';
    protected $fillable = ['nombre', 'descripcion', 'precio', 'stock'];
}
