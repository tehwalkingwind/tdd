package com.epam.spb.javalab.mar;

import lombok.Value;
import lombok.experimental.Delegate;

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

@Value
public class PooledConnection implements Connection {

    @Delegate(excludes = AutoCloseable.class)
    Connection connection;

    @Override
    public void close() {

    }
}
