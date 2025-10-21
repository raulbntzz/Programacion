<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use App\Models\User;
use App\Models\Producto_RBM;

class DatabaseSeeder extends Seeder
{
    use WithoutModelEvents;

    public function run(): void
    {
        User::factory()->create([
            'name' => 'Test User',
            'email' => 'test@example.com',
        ]);

        Producto_RBM::truncate();

        Producto_RBM::create([
            'nombre' => 'Teclado Mecánico RGB',
            'descripcion' => 'Teclado retroiluminado con switches rojos de alta durabilidad.',
            'precio' => 79.99,
            'stock' => 15,
        ]);

        Producto_RBM::create([
            'nombre' => 'Ratón Inalámbrico',
            'descripcion' => 'Mouse ergonómico con batería recargable y conexión Bluetooth.',
            'precio' => 29.99,
            'stock' => 25,
        ]);

        Producto_RBM::create([
            'nombre' => 'Monitor 24” Full HD',
            'descripcion' => 'Monitor LED con resolución 1920x1080 y tasa de refresco de 75Hz.',
            'precio' => 149.99,
            'stock' => 10,
        ]);

        Producto_RBM::create([
            'nombre' => 'Auriculares Inalámbricos',
            'descripcion' => 'Auriculares Bluetooth con cancelación de ruido y estuche de carga.',
            'precio' => 59.99,
            'stock' => 30,
        ]);

        Producto_RBM::create([
            'nombre' => 'Silla Gamer Reclinable',
            'descripcion' => 'Silla ergonómica con reposabrazos ajustables y soporte lumbar.',
            'precio' => 199.99,
            'stock' => 8,
        ]);

        Producto_RBM::create([
            'nombre' => 'Micrófono USB Profesional',
            'descripcion' => 'Micrófono de condensador ideal para streaming y podcasting.',
            'precio' => 89.99,
            'stock' => 12,
        ]);
    }
}
