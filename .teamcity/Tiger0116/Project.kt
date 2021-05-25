package Tiger0116

import Tiger0116.buildTypes.*
import Tiger0116.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0116")
    name = "Tiger0116"

    vcsRoot(Tiger0116_cVCSroot)

    buildType(Tiger0116_Hi3)
    buildType(Tiger0116_Hi1)
    buildType(Tiger0116_Hi2)
    buildType(Tiger0116_Hi0)
})
